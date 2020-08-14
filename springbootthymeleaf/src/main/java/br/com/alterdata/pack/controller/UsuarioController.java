package br.com.alterdata.pack.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.alterdata.pack.domain.Usuario;
import br.com.alterdata.pack.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repositorioDoUsuario;
	
    @GetMapping("/logar")
    public String exibirFormularioDeLogin(Usuario usuario) throws IOException {
    	return "adicionarUsuario";
    }
     
    @PostMapping("/adicionar-usuario")
    public String adicionarUsuario(@Valid Usuario usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "adicionarUsuario";
        }
         
        repositorioDoUsuario.save(usuario);
        model.addAttribute("usuarios", repositorioDoUsuario.findAll());
        
        return "index";
    }
    
    @GetMapping("/editar/{id}")
    public String exibirFormularioDeEdicao(@PathVariable("id") long id, Model model) {
        Usuario user = repositorioDoUsuario.findById(id).orElseThrow(() -> new IllegalArgumentException("Id de Usuário inválido:" + id));
        model.addAttribute("usuario", user);
        
        return "atualizarUsuario";
    }
    
    @PostMapping("/atualizar/{id}")
    public String atualizarUsuario(@PathVariable("id") long id, @Valid Usuario usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	usuario.setId(id);
            
            return "atualizarUsuario";
        }
        
        repositorioDoUsuario.save(usuario);
        model.addAttribute("usuarios", repositorioDoUsuario.findAll());
        
        return "index";
    }
    
    @GetMapping("/apagar/{id}")
    public String apagarUsuario(@PathVariable("id") long id, Model model) {
        Usuario user = repositorioDoUsuario.findById(id).orElseThrow(() -> new IllegalArgumentException("Id de Usuário inválido:" + id));
        
        repositorioDoUsuario.delete(user);
        model.addAttribute("usuarios", repositorioDoUsuario.findAll());
        
        return "index";
    }
}
