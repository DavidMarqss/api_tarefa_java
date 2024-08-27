package application.service;

import org.springframework.stereotype.Service;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

import application.model.Usuario;

@Service
public class TokenService {
    private String secreto = "segredo";

    public String generateToken(Usuario usuario) {
        try{
            Algorithm algorithm = Algorithm.HMAC256(secreto);
        }catch(JWTCreationException exception){
            throw new RuntimeException("Erro ao gerar JWT", exception);
        }
    }
}
