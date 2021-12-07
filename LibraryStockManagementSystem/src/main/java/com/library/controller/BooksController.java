package com.library.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.Books;
import com.library.model.Librarians;
import com.library.service.BooksService;
import com.library.service.LibService;

@Controller
public class BooksController {
	
	@Autowired
	Books books;
	
	@Autowired
	BooksService booksService;
	
	@Autowired
	Librarians librarians;
	
	@Autowired
	LibService libService;
	
	String msg,msg2;
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("librarians", librarians);
		return "index";
	}
	/*@RequestMapping("Login")
	public String home(Model model) {
		model.addAttribute("books", books);
		model.addAttribute("msg", msg);
		return "Search";
	}*/
	
	@RequestMapping("validateLib")
	public ModelAndView validateLib(@ModelAttribute("Librarians") Librarians librarians,  ModelAndView mv2) {
		
		Librarians librarians2 = libService.validateLib(librarians);
		if(librarians2!=null) {
			
			System.out.println("Login Successfull");
			mv2.addObject("librarians", librarians2);
			mv2.setViewName("home");
			return mv2;
			
		}else {
			System.out.println("Login Failed");
		
			mv2.addObject("librarians", librarians2);
			mv2.setViewName("redirect:/");
			return mv2;
		}
		
	}
	@RequestMapping("/addlib")
	public String showaddlib(Model model) {
		model.addAttribute("librarians", librarians);
		return "addlib";
	}
	@RequestMapping("/reglib")
	public ModelAndView saveLib(@ModelAttribute("librarians") Librarians librarians, ModelAndView mv) throws IOException {
		
		System.out.println("In Save User");
		libService.addLib(librarians);
		mv.addObject("msg", "Librarian is Added Successfully");
		//mv.addObject("user", user);
		mv.setViewName("index");
		return mv;
	}

	
	@RequestMapping("/SecPage")
	public String home() {
		return "home";
	}
	@RequestMapping("Search")
	public String home(Model model) {
		model.addAttribute("books", books);
		model.addAttribute("msg", msg);
		return "Search";
	}
	
	@RequestMapping("validate")
	public ModelAndView validateBooks(@ModelAttribute("books") Books books,  ModelAndView mv2) {
		
		Books user1 = booksService.validateBooks(books);
		if(user1!=null) {
			
			System.out.println("Login Successfull");
			msg = "Book is Available";
			Books books1 = booksService.validateBooks(books);
			mv2.addObject("books", books1);
			mv2.setViewName("showbooks");
			return mv2;
			
		}else {
			System.out.println("Login Failed");
			msg = "Sorry, Book is not Available";
			Books books1 = null;
			mv2.addObject("books", books1);
			mv2.setViewName("redirect:/Search");
			return mv2;
		}
		
	}

	@RequestMapping("/registeration")
	public String showRegisterationForm(Model model) {
		model.addAttribute("books", books);
		return "registeration";
	}
	
	@RequestMapping("submitform")
	public ModelAndView saveUser(@ModelAttribute("books") Books books, ModelAndView mv, @RequestParam("pic") MultipartFile file) throws IOException {
		
		System.out.println("In Save User");
		byte[] bookCover = file.getBytes();
		books.setBookCoverPic(bookCover);
		booksService.addBooks(books);
		mv.addObject("msg", "Book is Added Successfully");
		//mv.addObject("user", user);
		mv.setViewName("registeration");
		return mv;
	}
	
	@RequestMapping("getall")
	public ModelAndView getAllBooks(ModelAndView mv) {
		List<Books> booksList = booksService.getAllBooks();
		mv.addObject("books", booksList);
		mv.addObject("msg", msg);
		mv.setViewName("viewbooks");
		return mv;
	}
	
	@RequestMapping("getbooksform")
	public String getBooksForm() {
		return "getbooks";
	}
	
	@RequestMapping("getbyid")
	public ModelAndView getById(@RequestParam("bookId") int bookId, ModelAndView mv) {
		Books books = booksService.getBooksById(bookId);
		mv.addObject("books", books);
		mv.setViewName("showbooks");
		return mv;
	}
	
	@RequestMapping("updatebooks/{bookId}")
	public String getUpdateBooks(@PathVariable int bookId, Model m) {
		
		Books books = booksService.getBooksById(bookId);
		System.out.println("In Controller : "+books);
		m.addAttribute("books", books);
		return "updateform";
		
	}
	
	@RequestMapping("saveupdate")
	public String saveUpdate(@ModelAttribute("books") Books books, ModelAndView mv, @RequestParam("pic") MultipartFile file) throws IOException {
		byte[] bookCover = file.getBytes();
		books.setBookCoverPic(bookCover);
		booksService.updateBooks(books);
		return "redirect:/getall";
	}
	
	@RequestMapping("deletebooks/{bookId}")
	public String deleteUser(@PathVariable int bookId) {
		booksService.deleteBooks(bookId);
		return "redirect:/getall";
	}
}
