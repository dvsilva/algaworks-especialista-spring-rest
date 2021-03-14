package com.algaworks.algafood.api.assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.api.controller.CidadeController;
import com.algaworks.algafood.api.controller.EstadoController;
import com.algaworks.algafood.api.model.CidadeModel;
import com.algaworks.algafood.domain.model.Cidade;

@Component
public class CidadeModelAssembler 
		extends RepresentationModelAssemblerSupport<Cidade, CidadeModel> {

	@Autowired
	private ModelMapper modelMapper;
	
	public CidadeModelAssembler() {
		super(CidadeController.class, CidadeModel.class);
	}
	
	@Override
	public CidadeModel toModel(Cidade cidade) {
		CidadeModel cidadeModel = createModelWithId(cidade.getId(), cidade);
		
		// mapeamento de objeto para objeto
		modelMapper.map(cidade, cidadeModel);

		
//		createModelWithId - metodo que cria o link self		
//		CidadeModel cidadeModel = modelMapper.map(cidade, CidadeModel.class);

//		cidadeModel.add(linkTo(methodOn(CidadeController.class)
//				.buscar(cidadeModel.getId())).withSelfRel());
		
//		cidadeModel.add(linkTo(CidadeController.class)
//				.slash(cidadeModel.getId()).withSelfRel());
		
//		cidadeModel.add(new Link("http://api.algafood.local:8080/cidades/1"));
//		cidadeModel.add(new Link("http://api.algafood.local:8080/cidades/1", IanaLinkRelations.SELF));
		
		
		cidadeModel.add(linkTo(methodOn(CidadeController.class)
				.listar()).withRel("cidades"));
		
//		cidadeModel.add(linkTo(CidadeController.class)
//				.withRel("cidades"));
		
//		cidadeModel.add(new Link("http://api.algafood.local:8080/cidades", "cidades"));
//		cidadeModel.add(new Link("http://api.algafood.local:8080/cidades", IanaLinkRelations.COLLECTION));

		
		cidadeModel.getEstado().add(linkTo(methodOn(EstadoController.class)
				.buscar(cidadeModel.getEstado().getId())).withSelfRel());
		
//		cidadeModel.getEstado().add(linkTo(EstadoController.class)
//				.slash(cidadeModel.getEstado().getId()).withSelfRel());
		
//		cidadeModel.getEstado().add(new Link("http://api.algafood.local:8080/estados/1"));
		
		return cidadeModel;
	}
	
	@Override
	public CollectionModel<CidadeModel> toCollectionModel(Iterable<? extends Cidade> entities) {
		// cidadesCollectionModel.add(linkTo(CidadeController.class).withSelfRel());
		
		return super.toCollectionModel(entities)
				.add(linkTo(CidadeController.class).withSelfRel());
	}
	
}