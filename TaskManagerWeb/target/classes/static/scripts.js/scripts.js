// scripts.js

// Função para validar o formulário de registro
function validateRegistrationForm() {
    var username = document.getElementById("username").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    if (username === "" || email === "" || password === "") {
        alert("Por favor, preencha todos os campos.");
        return false;
    }

    // Verificação de formato de email simples
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        alert("Por favor, insira um endereço de email válido.");
        return false;
    }

    return true;
}

// Função para validar o formulário de login
function validateLoginForm() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username === "" || password === "") {
        alert("Por favor, preencha todos os campos.");
        return false;
    }

    return true;
}