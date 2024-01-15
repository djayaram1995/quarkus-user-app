package dev.dj.resource;

import dev.dj.entity.User;
import dev.dj.service.UserService;
import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;

import java.util.List;

@Path("/user")
@AllArgsConstructor
@ApplicationScoped
public class UserResource {

    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @WithTransaction
    public Uni<List<User>> getAllUser() {
        return userService.getAllUser();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @WithTransaction
    public Uni<User> createUser(User user) {
        return userService.createUser(user);
    }
}
