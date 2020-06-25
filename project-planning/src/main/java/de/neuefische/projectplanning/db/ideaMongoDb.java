package de.neuefische.projectplanning.db;
import de.neuefische.projectplanning.model.Idea;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ideaMongoDb extends PagingAndSortingRepository<Idea,String> {
}
