package kodlama.io.kodlamaioDev.business.responses.languageResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListLanguage {
    private int id;
    private String name;
}
