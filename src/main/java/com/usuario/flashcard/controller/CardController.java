package com.usuario.flashcard.controller;

import com.usuario.flashcard.entity.Card;
import com.usuario.flashcard.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @PostMapping
    public Card createCard(@RequestBody Card card) {
        return cardRepository.save(card);
    }

    @GetMapping
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable Long id) {
        return cardRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Card updateCard(@PathVariable Long id, @RequestBody Card updatedCard) {
        return cardRepository.findById(id)
                .map(card -> {
                    card.setQuestion(updatedCard.getQuestion());
                    card.setAnswer(updatedCard.getAnswer());
                    return cardRepository.save(card);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable Long id) {
        cardRepository.deleteById(id);
    }
}
