package uz.nm.dto.response;

import lombok.*;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DepositResponse {
    private UUID depositId;
    private String depositName;
    private Double depositAmount;
    private Double interest;
    private Integer duration;
    private LocalDate depositDate;
    private String depositType;
}
