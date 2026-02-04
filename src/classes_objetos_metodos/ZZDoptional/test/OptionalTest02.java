package classes_objetos_metodos.ZZDoptional.test;

import classes_objetos_metodos.ZZDoptional.domain.Manga;
import classes_objetos_metodos.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 5"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(3)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga NewManga = MangaRepository.findByTitle("Naruto")
                .orElse(new Manga(4, "Naruto", 500));

        System.out.println(NewManga);

    }
}
