package de.neuefische.projectplanning.service;

import de.neuefische.projectplanning.db.ideaMongoDb;
import de.neuefische.projectplanning.model.Idea;
import de.neuefische.projectplanning.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaService {
    private final ideaMongoDb ideaDb;
    private final IdUtils idUtils;

    @Autowired
    public IdeaService(ideaMongoDb ideaDb, IdUtils idUtils) {
        this.ideaDb = ideaDb;
        this.idUtils = idUtils;
    }

    public Iterable<Idea> getAll(){
        return ideaDb.findAll();
    }

    public Idea add(String description) {
        Idea idea = new Idea();
        idea.setId(idUtils.generateRandomId());
        idea.setDescription(description);
        return ideaDb.save(idea);
    }
}
