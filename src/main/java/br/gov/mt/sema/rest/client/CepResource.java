package br.gov.mt.sema.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class CepResource {

    @Inject
    @RestClient 
    CepService cepService;

    @GET
    @Path("/cep/{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cep cep(String cep) {
        return cepService.getByCep(cep);
    }
}
