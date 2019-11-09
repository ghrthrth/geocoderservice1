Бищнес логика:
//class entity

@Getter
@Setter
@Entity
@Table(name="result")
    @Entity
public class Responce implements Serializable {

    private Long id;
    private String adress;
    private String coordinates;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Column
    public String getCoordinates() {
        return longitude;
    }

    public void setCoordimates(String phone) {
        this.coordinates = coordinates;
    }

    

}


Controller
//class controller

@Service//бывший сервис
Responce get.Responce() 
@Owerride user.getUser() 


@RestController
@RequestMapping("/request")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/Responce/{adress}") 

    Public Reponce sayAdress(@PathVariable Long adress) {
return responceService.getReponce(adress);
                ));
    }
}


Принимаем даннве, обрабатываем, обрашаемся к репозиторию
Билд ответа, возврат ответа
Service-
