package uz.nm.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DepositTypeResponse {
    private Double minAmount;
    private Double interest;
    private Integer duration;
    private String returnType;
}
