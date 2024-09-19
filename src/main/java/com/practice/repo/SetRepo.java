package com.practice.repo;

import com.practice.model.Cards;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class SetRepo{
    private final List<Cards> cards = new ArrayList<>();

    public void cardsRepoAddCards() {
        cards.add(new Cards(1, "Card1", 1, 1, 1,1));
        cards.add(new Cards(2, "Card2", 2, 1, 1,1));
        cards.add(new Cards(3, "Card3", 3, 1, 1,1));
        cards.add(new Cards(4, "Card4", 1, 1, 2,1));
        cards.add(new Cards(5, "Card5", 2, 1, 2,1));
        cards.add(new Cards(6, "Card6", 3, 1, 2,1));
        cards.add(new Cards(7, "Card7", 1, 1, 3,1));
        cards.add(new Cards(8, "Card8", 2, 1, 3,1));
        cards.add(new Cards(9, "Card9", 3, 1, 3,1));
    }

    public List<Cards> findAll() {
        return cards;
    }


    public Cards findById(int id) {
        return cards.stream()
                .filter(card -> Objects.equals(card.getCardId(), id))
                .findFirst()
                .orElse(null);
    }

    public Cards findByName(String name) {
        return cards.stream()
                .filter(card -> Objects.equals(card.getCardName(), name))
                .findFirst()
                .orElse(null);
    }



}
