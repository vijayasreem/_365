@Entity
@Table(name = "policy_endorsement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyEndorsement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "endorsement_type")
    private String endorsementType;

    @Column(name = "endorsement_details")
    private String endorsementDetails;
    
    @Column(name = "endorsement_coverage")
    private String endorsementCoverage;
    
    @Column(name = "endorsement_cost")
    private Double endorsementCost;

}