package com.practice.service;

import com.practice.model.Cards;
import com.practice.repo.SetRepo;
import com.practice.repo.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SetService {
    @Autowired
    SetRepo setRepo;

    public SetService(SetRepo setRepo) {
        this.setRepo = setRepo;
    }

    public Cards getCardById(int id) {
        return setRepo.findById(id);
    }

    public boolean checkIfSet(List<Cards> cards) {
        if (cards.size() != 3) {
            return false; // Ensure exactly 3 cards are provided
        }
        Cards c1 = cards.get(0);
        Cards c2 = cards.get(1);
        Cards c3 = cards.get(2);


        boolean allNumberCondition=checkOneCondition(c1.getNumber(), c2.getNumber(), c3.getNumber());
        boolean allColorCondition=checkOneCondition(c1.getColor(), c2.getColor(), c3.getColor());
        boolean allFillCondition=checkOneCondition(c1.getFill(), c2.getFill(), c3.getFill());
        boolean allShapeCondition=checkOneCondition(c1.getShape(), c2.getShape(), c3.getShape());
        return allNumberCondition && allColorCondition && allFillCondition && allShapeCondition;

    }


    boolean checkOneCondition(int a, int b, int c) {
        return (a == b && b == c) || (a != b && b != c && a != c);
    }




}
