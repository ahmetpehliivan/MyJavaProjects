package kodlama.io.kodlamaioDev.dataAccess.abstracts;

import kodlama.io.kodlamaioDev.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {

}
