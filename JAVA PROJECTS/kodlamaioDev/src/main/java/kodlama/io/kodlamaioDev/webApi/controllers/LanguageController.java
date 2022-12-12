package kodlama.io.kodlamaioDev.webApi.controllers;

import kodlama.io.kodlamaioDev.business.abstracts.LanguageService;
import kodlama.io.kodlamaioDev.business.requests.languageRequest.CreateLanguage;

import kodlama.io.kodlamaioDev.business.requests.languageRequest.UpdateLanguage;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetLanguageById;
import kodlama.io.kodlamaioDev.business.responses.languageResponse.GetListLanguage;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/languages")
public class LanguageController {

    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<GetListLanguage> getAll() throws Exception{
        return this.languageService.getAll();
    }

    @GetMapping("/getById")
    public GetLanguageById getById(@RequestParam int id) throws Exception{
        return this.languageService.getLanguageById(id);
    }

    @PostMapping("/add")
    public CreateLanguage add(@RequestBody CreateLanguage createLanguage) throws Exception{
        return this.languageService.add(createLanguage);
    }

    @DeleteMapping("/delete")
    String delete(@RequestParam int id) throws Exception{
        return  this.languageService.delete(id);
    }

    @PutMapping("/update")
    GetLanguageById update(@RequestParam int id, @RequestBody UpdateLanguage updateLanguage)throws Exception{
        return  this.languageService.update(id, updateLanguage);
    }

}
