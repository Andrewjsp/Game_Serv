package rest.security;

import entity.User;
import exception.UserNotFoundException;
import org.apache.commons.lang3.RandomStringUtils;
import service.UserService;

import javax.enterprise.inject.New;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.security.Principal;


@Path("/auth")
public class AuthenticationEndPoint {

    @Inject
    UserService userService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response authenticateUser(User user) {
        try {
            userService.findUser(user);
            NewCookie cookie = new NewCookie("token", issueToken());
            return Response.ok().cookie(cookie).build();
        } catch (UserNotFoundException e) {
            System.out.println("Такого пользователя нет");
        }
        return Response.status(Response.Status.FORBIDDEN).build();
    }

    private String issueToken() {
        String token = RandomStringUtils.random(10, true, true);
        return token;
    }

    @GET
 @Path("/test")
    public void test(@Context SecurityContext context){
        Principal principal=context.getUserPrincipal();
         System.out.println(principal.getName());
        System.out.println(context.getAuthenticationScheme());
    }
}
