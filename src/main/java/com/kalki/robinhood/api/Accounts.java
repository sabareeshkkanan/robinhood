package com.kalki.robinhood.api;

import com.kalki.robinhood.models.AccountInfo;
import com.kalki.robinhood.models.Multiple;
import com.kalki.robinhood.models.Portfolio;
import com.kalki.robinhood.models.Position;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class Accounts {
    @GetMapping("/")
    public Multiple<AccountInfo> getAll() {
        return new Multiple<>();
    }

    @GetMapping("/{accountId}/portfolio/")
    public Portfolio getPortFolio(@PathVariable("accountId") String accountId) {
        return new Portfolio();
    }

    @GetMapping("/{accountId}/positions/")
    public Multiple<Position> getAllPositions(@PathVariable("accountId") String accountId,
                                              @RequestParam(required = false) boolean nonzero) {
        return new Multiple<>();
    }

    @GetMapping("/{accountId}/positions/{positionId}/")
    public Position getPosition(@PathVariable("accountId") String accountId,
                                @PathVariable("positionId") String positionId) {
        return new Position();
    }

}
