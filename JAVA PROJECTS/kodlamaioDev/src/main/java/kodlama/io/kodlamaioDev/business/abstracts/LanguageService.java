package kodlama.io.kodlamaioDev.business.abstracts;

import kodlama.io.kodlamaioDev.business.requests.languageRequest.CreateLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.DeleteLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.UpdateLanguage;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetLanguageById;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetListLanguage;
import kodlama.io.kodlamaioDev.entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    CreateLanguage add(CreateLanguage createLanguage) throws Exception;
    GetLanguageById getById(int id) throws Exception;
    String delete(int id) throws Exception;
    GetLanguageById update(int id, UpdateLanguage updateLanguage) throws Exception;
    List<GetListLanguage> getAll() throws Exception;








}
