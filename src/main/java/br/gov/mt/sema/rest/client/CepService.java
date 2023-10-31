package br.gov.mt.sema.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("")
@RegisterRestClient(configKey = "via-cep-api")
public interface CepService {

    @GET
    @Path("/{cep}/json/")
    @Produces("application/json")
    Cep getByCep(@PathParam("cep") String cep);
}
