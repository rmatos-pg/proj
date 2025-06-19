# 🛠️ Backend CI Pipeline com Jenkins, Docker e SonarQube

Este repositório contém um projeto Java de exemplo (Spring Boot) integrado a uma **pipeline de CI (Integração Contínua)** usando:

- Jenkins
- SonarQube
- Docker
- Maven
- GitHub

O objetivo é fornecer um ambiente completo, pronto para ser **executado localmente com Docker**, para fins de estudo, testes ou extensão.

---

## 📦 Tecnologias e Ferramentas Utilizadas

- **Java 21 (Eclipse Temurin)**
- **Spring Boot**
- **Maven**
- **Docker / Docker Compose**
- **Jenkins**
- **SonarQube**
- **GitHub**
- **Linux (base WSL2)**

---

## 🚀 Como Executar Localmente

### 1. ⚙️ Pré-requisitos

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/install/)
- (Opcional) [Visual Studio Code](https://code.visualstudio.com/) com a extensão *Remote - Containers* ou *Dev Containers*

---

### 2. 📁 Estrutura esperada do projeto

```
.
├── backend/                  # Projeto Java (Spring Boot)
│   └── Jenkinsfile           # Pipeline declarativa para CI
├── jenkins/                 # Configurações opcionais para Jenkins (se necessário)
├── docker-compose.yml       # Orquestra Jenkins + Sonar + app
└── README.md
```

---

### 3. ▶️ Subindo o ambiente com Docker

Execute o seguinte comando na raiz do projeto:

```bash
docker-compose up -d
```

Este comando irá levantar:

- Jenkins: [http://localhost:8080](http://localhost:8080)
- SonarQube: [http://localhost:9000](http://localhost:9000)

A primeira inicialização pode levar alguns minutos.

---

### 4. 🧪 Primeira execução da pipeline

#### Acesso ao Jenkins

1. Acesse o Jenkins: [http://localhost:8080](http://localhost:8080)
2. Crie o primeiro usuário ou use o já configurado (caso tenha sido versionado)
3. O Jenkins buscará automaticamente este repositório (`main`) e executará o pipeline contido no `Jenkinsfile`:

#### O que a pipeline faz:

1. Clona o projeto do GitHub (usando credencial segura)
2. Executa `mvn clean package -DskipTests`
3. Executa `mvn sonar:sonar` para análise de qualidade no SonarQube
4. Espera o **Quality Gate**
5. (Opcional) Etapas futuras de build da imagem Docker e deploy local

---

## 📊 SonarQube

- A análise de código será publicada em: [http://localhost:9000](http://localhost:9000)
- Projeto será identificado com a key: `backend`
- Qualidade do código será verificada automaticamente pelo **Quality Gate**

---

## 🔐 Segurança

⚠️ **Importante**: nenhuma credencial sensível está exposta neste repositório.

- Credenciais de GitHub e tokens do Sonar são injetados via Jenkins `withCredentials`
- O repositório é seguro para ser clonado e testado por outras pessoas

---

## 🙋‍♂️ Contribuindo

Sinta-se livre para:

- Estender a pipeline
- Adicionar novos testes, steps de build, deploy ou notificações
- Criar issues ou enviar pull requests

---

## 🧼 Para encerrar o ambiente

Para parar e remover os containers:

```bash
docker-compose down
```

---

## 📚 Referências

- [Documentação Jenkins](https://www.jenkins.io/doc/)
- [SonarQube Docs](https://docs.sonarsource.com/)
- [Maven](https://maven.apache.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)

---

## 👨‍💻 Autor

**Rodrigo Matos**
Projeto de estudo e demonstração de CI/CD com ferramentas de mercado.

---