# ✅ Results — Uma forma simples de representar sucesso ou erro em operações

A biblioteca **Results** fornece uma estrutura leve para representar o resultado de operações em Java,
sem necessidade de lançar exceções para fluxos normais da aplicação.

Ela evita retornos `null`, padroniza tratamentos e torna o código mais claro.

---

## ✨ O que essa biblioteca oferece

✔ Representação clara entre **sucesso** e **erro**  
✔ Elimina retorno `null` e uso excessivo de exceções  
✔ Facilita validações, regras de negócio e repositórios  
✔ API simples, intuitiva e segura  
✔ Sem dependências externas

---

## ✅ Estrutura principal

A classe base é:

```java
public abstract class Resultado<S> {
    private String msg;

    public static <S> Resultado<S> sucesso(String msg, S obj)
    public static <S> Resultado<S> erro(String msg)

    public boolean foiSucesso()
    public boolean foiErro()

    public Sucesso<S> comoSucesso()
    public Erro comoErro()

    public String getMsg()
}
```

Implementações concretas:

```java
public class Sucesso<S> extends Resultado<S> {
    private S valor;
}

public class Erro<S> extends Resultado<S> {
    // Apenas mensagem
}
```

---

## ✅ Exemplo de uso

### Criando um resultado

```java
public Resultado<Usuario> buscarUsuario(String email){

    Usuario u = dao.buscar(email);

    if(u == null){
        return Resultado.erro("Usuário não encontrado");
    }

    return Resultado.sucesso("Usuário encontrado com sucesso", u);
}
```

### Consumindo o resultado

```java
Resultado<Usuario> r = buscarUsuario("aaa@bbb.com");

if(r.foiSucesso()){
    Usuario u = r.comoSucesso().getValor();
    System.out.println("Bem vindo, " + u.getNome());
}else{
    System.out.println("Erro: " + r.getMsg());
}
```

---

## ✅ Importando no seu projeto (Maven)

Inclua no arquivo `pom.xml` do seu projeto repositório adicional de bibliotecas:
```xml
    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
E inclua a seguinte dependência:

```xml

      <dependency>
            <groupId>com.github.hugoperlin</groupId>
            <artifactId>results</artifactId>
            <version>1.0.1</version>
        </dependency>
```


---

## ✅ Quando usar

- Métodos de serviço e regras de negócio
- Repositórios e DAOs
- Validações
- Operações que podem falhar, mas não justificam exceção

---

## ✅ Vantagens

✔ Evita `null`  
✔ Evita exceções desnecessárias  
✔ Padroniza retornos  
✔ Leve e sem dependências  
✔ Fácil de testar

---

## 📄 Licença

Código livre para uso educacional e profissional.
