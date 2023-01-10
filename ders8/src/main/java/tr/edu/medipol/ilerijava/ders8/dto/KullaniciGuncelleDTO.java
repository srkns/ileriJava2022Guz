package tr.edu.medipol.ilerijava.ders8.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KullaniciGuncelleDTO {
    Long id;
    String ad;
}
