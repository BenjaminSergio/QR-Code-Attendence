# **Sistema de Presença via QR Code**

Um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos (POO). Esta aplicação simplifica o controle de presença utilizando a tecnologia de QR Code, oferecendo interfaces específicas para professores e alunos.

## **👥 Criadores**

+ [**Benjamin Sergio**](www.linkedin.com/in/benjamin-silva-sergio)

+ [**Lucas Pertel**](https://www.linkedin.com/in/lucas-pertel-658694251/)

+ [**Larissa**]()

## **📺Apresentação do Projeto**

Assista à demonstração do nosso projeto no YouTube:
Assista ao vídeo do projeto

##🛠 **Ferramentas & Tecnologias**

Este projeto foi construído utilizando as seguintes ferramentas:

**Linguagem:** Java (Android)

**IDE:** Android Studio / IntelliJ IDEA

**Banco de Dados & Auth:** Firebase (Firestore & Authentication)

**Geração/Leitura de QR:** Biblioteca ZXing (Zebra Crossing)

**Gerenciador de Dependências:** Gradle

## **🔒 Segurança & Configuração do Git**

Chaves de API e Dados Sensíveis

Para manter a segurança, todos os arquivos de configuração sensíveis, especificamente o google-services.json e propriedades de ambiente local, foram tratados com cuidado.

Importante: Se você estiver clonando este repositório, deverá fornecer seu próprio arquivo google-services.json a partir do seu console Firebase para habilitar as funções de banco de dados e autenticação.

Configuração do .gitignore

Nosso arquivo .gitignore está configurado para manter o repositório limpo e seguro, excluindo:

Arquivos específicos da IDE (.idea/, .iml, .settings/)

Artefatos de compilação (build/, bin/, captures/)

Arquivos de propriedades locais (local.properties)

Dados JSON sensíveis (*.json - especificamente para chaves do Firebase)

## **🚀 Como Executar o Projeto**

**Clonar o Repositório:**

git clone [https://github.com/BenjaminSergio/QR-Code-Attendence.git](https://github.com/BenjaminSergio/QR-Code-Attendence.git)


**Configurar o Firebase:**

Crie um projeto no Console do Firebase.

Adicione um App Android com o nome do pacote com.example.teste.

Baixe o arquivo google-services.json e coloque-o no diretório app/ do projeto.

**Abrir no Android Studio:**

File > Open > Selecione a pasta do projeto.

Aguarde a sincronização do Gradle.

**Executar o App:**

Conecte um dispositivo Android ou use um Emulador (API 21 ou superior).

Clique no botão Run no Android Studio.

## **🎓 Contexto Acadêmico**

Este é um Projeto Acadêmico desenvolvido para demonstrar a aplicação dos princípios de Programação Orientada a Objetos, integração com bancos de dados em nuvem e interação com hardware (Câmera/QR Code) em um ambiente mobile.
