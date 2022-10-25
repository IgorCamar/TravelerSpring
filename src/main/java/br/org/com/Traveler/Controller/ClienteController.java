package br.org.com.Traveler.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.Traveler.Model.*;
import br.org.com.Traveler.Repository.*;

@Controller
@RequestMapping("/")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/destinos")
	public String destinos() {
		return "destinos";
	}
	@GetMapping("/promocoes")
	public String promocoes() {
		return "promocoes";
	}
	@GetMapping("/pacotes")
	public String pacotes() {
		return "pacotes";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
	//listar
/*	@GetMapping
	public ModelAndView listar() {
		ModelAndView ModelAndView = new ModelAndView("/home");

		List<Cliente> clientes = clienteRepository.findAll();
		ModelAndView.addObject("cliente", clientes);

		return ModelAndView;
	} */
	//cadastro
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("/register");

		modelAndView.addObject("cliente", new Cliente());

		return modelAndView;
	}
	//
	@PostMapping("/cadastrar")
	public ModelAndView cadastrar(Cliente cliente) throws IOException {
		ModelAndView modelAndView = new ModelAndView("redirect:/home");
		
		clienteRepository.save(cliente);
		
		return modelAndView;

		}

}
	
	
	
	
	
