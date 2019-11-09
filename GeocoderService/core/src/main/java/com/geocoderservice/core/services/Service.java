
//class entity

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
