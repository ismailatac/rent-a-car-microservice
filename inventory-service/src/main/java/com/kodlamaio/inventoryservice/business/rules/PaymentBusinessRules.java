package com.kodlamaio.inventoryservice.business.rules;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentBusinessRules {
//    private final PaymentRepository repository;
//
//    public void checkIfPaymentExists(int id) {
//        if (!repository.existsById(id)) {
//            throw new BusinessException(Messages.Payment.NotFound);
//        }
//    }
//
//    public void checkIfBalanceIdEnough(double balance, double price) {
//        if (balance < price) {
//            throw new BusinessException(Messages.Payment.NotEnoughMoney);
//        }
//    }
//
//    public void checkIfCardExists(String cardNumber) {
//        if (repository.existsByCardNumber(cardNumber)) {
//            throw new BusinessException(Messages.Payment.CardNumberAlreadyExists);
//        }
//    }
//
//    public void checkIfPaymentIsValid(CreateRentalPaymentRequest request) {
//        if (!repository.existsByCardNumberAndCardHolderNameAndCardExpirationYearAndCardExpirationMonthAndCardCvv(
//                request.getCardNumber(),
//                request.getCardHolderName(),
//                request.getCardExpirationYear(),
//                request.getCardExpirationMonth(),
//                request.getCardCvv()
//        )) {
//            throw new BusinessException(Messages.Payment.NotAValidPayment);
//        }
    }

