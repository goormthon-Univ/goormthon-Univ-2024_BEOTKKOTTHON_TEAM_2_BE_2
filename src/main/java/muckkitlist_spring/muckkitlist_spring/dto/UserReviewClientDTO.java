package muckkitlist_spring.muckkitlist_spring.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
public class UserReviewClientDTO {
    private final String userReviewId;
    private final String kakaoId;
    private final String restaurantName;
    private final double star;
    private final String writeTime;
    private final String details;
    private final int like_count;
}
