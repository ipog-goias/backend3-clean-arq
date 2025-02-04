package br.edu.ipog.backend3.app.api.produto;

import br.edu.ipog.backend3.app.generics.GenericOperationResource;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/produtos")
@Tag(name = "Produto", description = "Operações relacionadas a Produto")
public interface ProdutoResource extends GenericOperationResource<ProdutoDto, Integer> {

}
