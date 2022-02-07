import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class customer {
    private Integer Id;
    private String firstName;
    private String lastName;
    private String email;

}
