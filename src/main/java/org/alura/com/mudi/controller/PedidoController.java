package org.alura.com.mudi.controller;

import javax.validation.Valid;

import org.alura.com.mudi.dto.PedidoRequisicao;
import org.alura.com.mudi.model.Pedido;
import org.alura.com.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    // Injetando o pedidoRepository para que ele possa ser instanciado
    @Autowired
    private PedidoRepository pedidoRepository;

    // Passando como parametro DTO pedidoRequisicao para receber os dados da view e passar para model
    @GetMapping("formulario")
    public ModelAndView formulario(PedidoRequisicao requisicao) {
        ModelAndView modelAndView = new ModelAndView("pedido/formulario");
        return modelAndView;
    }

    // Processo que grava pedido no banco, é feita a validacao dos campos
    @PostMapping("novo")
    public String novoPedido(@Valid PedidoRequisicao requisicao, BindingResult result) {
        if (result.hasErrors()) {
            return "pedido/formulario";
        }
        Pedido pedido = requisicao.toPedido();
        pedidoRepository.save(pedido);
        return "redirect:/home";
    }
}
