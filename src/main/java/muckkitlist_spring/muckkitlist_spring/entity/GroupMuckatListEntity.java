package muckkitlist_spring.muckkitlist_spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "group_muckat_list")
@Getter
@RequiredArgsConstructor
public class GroupMuckatListEntity {
  @Id
  @Column(name = "groupmuckat_id")
  private String groupmuckatId;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  @JoinColumn(name = "user_id")
  private UserInfoEntity user;

  @Column(name = "group_name")
  private String groupName;

  @Column(name = "room_master")
  private byte roomMaster;
}
