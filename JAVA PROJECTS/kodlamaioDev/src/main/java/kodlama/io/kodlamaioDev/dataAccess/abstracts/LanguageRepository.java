package kodlama.io.kodlamaioDev.dataAccess.abstracts;

import kodlama.io.kodlamaioDev.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
