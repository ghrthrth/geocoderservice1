Бищнес логика:
//class entity

@Getter
@Setter
@Entity
@Table(name="result")
public class Responce {
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

@Service
public class UserServiceImpl  {

    Optional<User> save(User user);
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> save(User user) {
        return Optional.of(userRepository.save(user));
    }
}

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return service.save(user).map(u -> new ResponseEntity<>(u, HttpStatus.OK))
                .orElseThrow(() -> new UserException(
                        String.format(ErrorType.USER_NOT_SAVED.getDescription(), user.toString())
                ));
    }
}

Принимаем даннве, обрабатываем, обрашаемся к репозиторию
Билд ответа, возврат ответа
Service-
