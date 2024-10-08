package origin.model.task;

import jakarta.persistence.*;
import lombok.*;
import origin.model.project.Project;
import origin.model.space.Space;
import origin.model.status.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "task")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private Long OwnerId;

    private Long executorId;

    @ElementCollection
    private List<String> image;

    private String place;

    private String checkpoint;

    @ElementCollection
    private List<String> labels;

    private LocalDateTime createDate;

    @Column(nullable = false)
    private LocalDateTime deadlineDate;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private Status status;
}
