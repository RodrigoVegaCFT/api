package com.example.demom.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class StoryController {

    @GetMapping("/story")
    public String getStory() {
        String story = "Érase una vez en un vasto desierto llamado Arenas Ardientes, donde el sol ardía implacablemente y la arena se extendía hasta donde alcanzaba la vista. En medio de este árido paisaje vivía un perro llamado Max, un pequeño y valiente canino que anhelaba vivir aventuras emocionantes.\n\n"
                + "Un día, mientras exploraba las dunas, Max se encontró con un dinosaurio llamado Rex, que también ansiaba la emoción de una carrera en el desierto. Ambos decidieron unir fuerzas y organizar una competencia única. La noticia se extendió rápidamente por el desierto, y pronto diversos animales se unieron a la carrera.\n\n"
                + "El sol brillaba intensamente mientras los competidores se alineaban en la línea de salida. La bandera fue agitada, y todos los participantes se lanzaron a toda velocidad, poniendo a prueba su resistencia y habilidades en medio del desierto inhóspito. Max y Rex corrían juntos, el perro veloz y ágil, y el dinosaurio poderoso y robusto. Aunque el desierto les presentaba obstáculos desafiantes, su determinación y amistad les daban fuerzas para seguir adelante. Al final, Max y Rex cruzaron juntos la meta, celebrando su increíble hazaña y sellando una amistad que duraría para siempre.\n\n"
                + "Y así, el perro y el dinosaurio demostraron que incluso en los lugares más inhóspitos, los lazos de amistad y la pasión por la aventura pueden superar cualquier desafío. Su historia se convirtió en una leyenda que perduraría mientras dejaban huellas en la vastedad del desierto de las Arenas Ardientes.";

        return story;
    }
}