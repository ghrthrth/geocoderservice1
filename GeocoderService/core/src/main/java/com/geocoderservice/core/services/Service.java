
//package model
{
@Getter
@Setter
@Entity
@Table(name="Responce")
@NoArgsConstructor 
@AllArgsConstructor
Public class Respoce{
@Id
Private Long Id;
Private String adress;
Private String coordinates;
} 


//Repository
Import model(лень писать полностью)//это главный импорт тут, остальное и так понятно
@Repository
Piblic interface ResponceRepository extends CrudRepository <Responce, Long>{
Responce get.ById(adress);
} 
    


//
Controller
//service
Responce getResponce(adress);
@Service
@RequiredArgsConstructor 

Private final ResponceRepository responceRepository;

@Override 
Public Responce get.Responce(adress) {
return responceRepository.findById(adress) ;
} 
//controllers
    @PostMapping("/Responce/{adress}") 

    Public Reponce sayAdress(@PathVariable Long adress) {
return responceService.getReponce(adress);
                ));
    }
}

//личные пометки
Принимаем даннве, обрабатываем, обрашаемся к репозиторию
Билд ответа, возврат ответа
Service-
