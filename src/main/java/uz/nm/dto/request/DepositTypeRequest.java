package uz.nm.dto.request;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DepositTypeRequest {
    private Long id;
    private Integer minAmount;
    private Integer interest;
    private Double duration;
    private String returnType;
}
