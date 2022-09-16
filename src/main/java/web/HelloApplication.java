package web;

import web.repositories.impl.*;
import web.repositories.interfaces.*;
import web.services.impl.CategoryServiceImpl;
import web.services.impl.CommentServiceImpl;
import web.services.impl.PostServiceImpl;
import web.services.impl.UserServiceImpl;
import web.services.interfaces.CategoryService;
import web.services.interfaces.CommentService;
import web.services.interfaces.PostService;
import web.services.interfaces.UserService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class HelloApplication extends ResourceConfig {
    public HelloApplication() {
        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(CategoryRepositoryImpl.class).to(CategoryRepository.class).in(Singleton.class);
                this.bind(PostRepositoryImpl.class).to(PostRepository.class).in(Singleton.class);
                this.bind(TagRepositoryImpl.class).to(TagRepository.class).in(Singleton.class);
                this.bind(PostTagRepositoryImpl.class).to(PostTagRepository.class).in(Singleton.class);
                this.bind(CommentRepositoryImpl.class).to(CommentRepository.class).in(Singleton.class);
                this.bind(UserRepositoryImpl.class).to(UserRepository.class).in(Singleton.class);

                this.bindAsContract(CategoryServiceImpl.class).to(CategoryService.class).in(Singleton.class);
                this.bindAsContract(PostServiceImpl.class).to(PostService.class).in(Singleton.class);
                this.bindAsContract(CommentServiceImpl.class).to(CommentService.class).in(Singleton.class);
                this.bindAsContract(UserServiceImpl.class).to(UserService.class).in(Singleton.class);
            }
        };
        register(binder);
        packages("web");
    }
}