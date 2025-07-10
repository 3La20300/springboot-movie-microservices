package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userID}")
    public List<CatalogItem> getCatalog(@PathVariable("userID") String userID)
    {
        return Collections.singletonList(
          new CatalogItem("Tranformers","Test", 4)
        );
    }
}
