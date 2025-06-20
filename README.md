
# 🛠️ Backend CI/CD Pipeline com Jenkins, Docker e SonarQube

Este repositório contém um projeto de backend Java (Spring Boot) com uma pipeline de Integração Contínua (CI) automatizada utilizando:

- Jenkins
- SonarQube
- Docker (com Docker Compose)
- Maven
- GitHub

O objetivo é fornecer um ambiente completo, pronto para ser executado localmente via Docker, ideal para estudos, testes e extensões.

---

## 📦 Tecnologias Utilizadas

- Java 21 (Eclipse Temurin)
- Spring Boot
- Maven
- Docker & Docker Compose
- Jenkins
- SonarQube
- GitHub
- Linux (ambiente WSL2, opcional)

---

## 🚀 Como Executar Localmente

### 1. ⚙️ Pré-requisitos

- Docker
- Docker Compose
- (Opcional) VS Code com a extensão Dev Containers

### 2. 📁 Estrutura esperada do projeto

```
.
├── backend/                # Projeto Java (Spring Boot)
│   └── Jenkinsfile         # Pipeline declarativa
├── docker-compose.yml      # Orquestra Jenkins + SonarQube + app
└── README.md
```

### 3. ▶️ Subindo o ambiente com Docker

Na raiz do projeto, execute:

```bash
docker-compose up -d
```

Esse comando iniciará os seguintes serviços:

- Jenkins: http://localhost:8081
- SonarQube: http://localhost:9000

⚠️ A primeira inicialização pode levar alguns minutos.

### 4. 🧪 Executando a pipeline no Jenkins

- Acesse o Jenkins em: http://localhost:8081
- Finalize o assistente de configuração (caso seja a primeira vez)
- O Jenkins executará automaticamente o pipeline definido no Jenkinsfile, que inclui:
  - ✔️ Clonagem do projeto do GitHub
  - ✔️ Build com Maven (`mvn clean package -DskipTests`)
  - ✔️ Análise de qualidade com SonarQube
  - ✔️ Validação com Quality Gate
  - ✔️ Build da imagem Docker
  - ✔️ Deploy local do backend (porta 8082 → 8080)

---

## 📊 SonarQube

- Acesse: http://localhost:9000
- Projeto: backend
- O Quality Gate garante que o código atenda padrões mínimos de qualidade

---

## 🔐 Segurança

Nenhuma credencial sensível está exposta neste repositório.

As credenciais (GitHub, SonarQube, Docker Hub) são injetadas via `withCredentials` no Jenkins.

Este projeto está pronto para ser testado de forma segura por qualquer pessoa.

---

## 🧼 Encerrando o ambiente

Para parar e remover os containers Docker:

```bash
docker-compose down
```

---

## 🙋‍♂️ Contribuindo

Você pode:

- Estender a pipeline com novos steps (testes, notificações, deploys)
- Corrigir erros ou adicionar melhorias
- Criar issues ou enviar pull requests

---

## 📚 Referências

- [Jenkins Documentation](https://www.jenkins.io/doc/)
- [SonarQube Docs](https://docs.sonarqube.org/)
- [Maven](https://maven.apache.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Docker Compose](https://docs.docker.com/compose/)

---

## 👨‍💻 Autor

Rodrigo Matos
Projeto de estudo e demonstração de CI/CD com ferramentas amplamente utilizadas no mercado.
