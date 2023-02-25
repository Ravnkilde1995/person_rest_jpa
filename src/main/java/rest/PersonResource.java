package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dtos.RenameMeDTO;
import facades.PersonFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Todo Remove or change relevant parts before ACTUAL use
@Path("person")
public class PersonResource {
        private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

        private static final PersonFacade FACADE =  PersonFacade.getPersonFacade(EMF);
        private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

        @GET
        @Produces({MediaType.APPLICATION_JSON})
        public String demo() {
            return "{\"msg\":\"Hello Person\"}";
        }

        @GET
        @Path("count")
        @Produces({MediaType.APPLICATION_JSON})
        public String getRenameMeCount() {

            long count = FACADE.getRenameMeCount();
            //System.out.println("--------------->"+count);
            return "{\"count\":"+count+"}";  //Done manually so no need for a DTO
        }
        @POST
        @Produces({MediaType.APPLICATION_JSON})
        @Consumes({MediaType.APPLICATION_JSON})
        public Response postExample(String input){
            RenameMeDTO rmdto = GSON.fromJson(input, RenameMeDTO.class);
            System.out.println(rmdto);
            return Response.ok().entity(rmdto).build();
        }
}
