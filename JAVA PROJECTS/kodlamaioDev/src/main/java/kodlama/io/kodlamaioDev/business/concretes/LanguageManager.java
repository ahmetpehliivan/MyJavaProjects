package kodlama.io.kodlamaioDev.business.concretes;

import kodlama.io.kodlamaioDev.business.abstracts.LanguageService;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.CreateLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.DeleteLanguage;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.UpdateLanguage;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetLanguageById;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetListLanguage;
import kodlama.io.kodlamaioDev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlamaioDev.entities.concretes.Language;
import kodlama.io.kodlamaioDev.entities.concretes.Technology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }


    @Override
    public CreateLanguage add(CreateLanguage createLanguage) throws Exception {

        checkNameDuplication(createLanguage.getName());
        checkNameEmptyControl(createLanguage.getName());
        ArrayList<Technology> technologies = new ArrayList<>();

        for (Integer id:createLanguage.get)
    }

    @Override
    public GetLanguageById getById(int id) throws Exception {
        return null;
    }

    @Override
    public String delete(int id) throws Exception {
        return null;
    }

    @Override
    public GetLanguageById update(int id, UpdateLanguage updateLanguage) throws Exception {
        return null;
    }

    @Override
    public List<GetListLanguage> getAll() throws Exception {
        return null;
    }

    private void checkNameEmptyControl(String name) throws Exception{
        if (name == null || name == "")
            throw new Exception("Girdiğiniz isim null dur.");
    }

    private void checkNameDuplication(String name) throws Exception{
        List<Language> languageList = this.languageRepository.findAll();
        for (Language l:languageList){
            if (l.getName().equalsIgnoreCase(name)){
                throw new Exception("Bu isim kullanılmaktadır.");
            }
        }
    }
}
