package com.github.bruce_mig.stock_trading_server.repository;

import com.github.bruce_mig.stock_trading_server.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    Stock findByStockSymbol(String stockSymbol);
}
