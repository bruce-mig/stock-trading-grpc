package com.github.bruce_mig.stock_trading_client.service;

import com.github.bruce_mig.StockRequest;
import com.github.bruce_mig.StockResponse;
import com.github.bruce_mig.StockTradingServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class StockClientService {

    @GrpcClient("stockService")
    private StockTradingServiceGrpc.StockTradingServiceBlockingStub serviceBlockingStub;

    public StockResponse getStockPrice(String stockSymbol) {
        StockRequest request = StockRequest.newBuilder()
                .setStockSymbol(stockSymbol)
                .build();
        return serviceBlockingStub.getStockPrice(request);
    }
}
