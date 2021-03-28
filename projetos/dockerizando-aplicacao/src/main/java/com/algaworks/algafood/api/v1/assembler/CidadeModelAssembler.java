package com.algaworks.algafood.api.v1.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.api.v1.AlgaLinks;
import com.algaworks.algafood.api.v1.controller.CidadeController;
import com.algaworks.algafood.api.v1.model.CidadeModel;
import com.algaworks.algafood.core.security.AlgaSecurity;
import com.algaworks.algafood.domain.model.Cidade;

@Component
public class CidadeModelAssembler 
		extends RepresentationModelAssemblerSupport<Cidade, CidadeModel> {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private AlgaLinks algaLinks;
	
	@Autowired
	private AlgaSecurity algaSecurity;
	
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
		
		if (algaSecurity.podeConsultarCidades()) {
	        cidadeModel.add(algaLinks.linkToCidades("cidades"));
			
//			cidadeModel.add(linkTo(methodOn(CidadeController.class)
//					.listar()).withRel("cidades"));
			
//			cidadeModel.add(linkTo(CidadeController.class)
//					.withRel("cidades"));
			
//			cidadeModel.add(new Link("http://api.algafood.local:8080/cidades", "cidades"));
//			cidadeModel.add(new Link("http://api.algafood.local:8080/cidades", IanaLinkRelations.COLLECTION));
	    }


	    if (algaSecurity.podeConsultarEstados()) {
	        cidadeModel.getEstado().add(algaLinks.linkToEstado(cidadeModel.getEstado().getId()));
			
//			cidadeModel.getEstado().add(linkTo(methodOn(EstadoController.class)
//					.buscar(cidadeModel.getEstado().getId())).withSelfRel());
			
//			cidadeModel.getEstado().add(linkTo(EstadoController.class)
//					.slash(cidadeModel.getEstado().getId()).withSelfRel());
			
//			cidadeModel.getEstado().add(new Link("http://api.algafood.local:8080/estados/1"));
	    }
		
		return cidadeModel;
	}
	
	@Override
	public CollectionModel<CidadeModel> toCollectionModel(Iterable<? extends Cidade> entities) {
//		cidadesCollectionModel.add(linkTo(CidadeController.class).withSelfRel());
		
//		return super.toCollectionModel(entities)
//				.add(linkTo(CidadeController.class).withSelfRel());
		  
//		return super.toCollectionModel(entities)
//		            .add(algaLinks.linkToCidades());
		
		CollectionModel<CidadeModel> collectionModel = super.toCollectionModel(entities);
	    
	    if (algaSecurity.podeConsultarCidades()) {
	        collectionModel.add(algaLinks.linkToCidades());
	    }

	    return collectionModel;
	}
	
}