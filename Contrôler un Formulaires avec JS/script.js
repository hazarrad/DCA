document.getElementById('reset-button').addEventListener('click', function () {
    document.getElementById('registration-form').reset(); // Resets the form fields

    // Clear previous error messages
    document.querySelectorAll('.error-message').forEach(function (message) {
        message.textContent = '';
    });
});

// Add your existing form validation code here
document.getElementById('registration-form').addEventListener('submit', function (event) {
    event.preventDefault(); // Prevent form submission

    // Clear previous error messages
    document.querySelectorAll('.error-message').forEach(function (message) {
        message.textContent = '';
    });

    // Validate fields (existing code)
    let isValid = true;

    // Nom
    const nom = document.getElementById('nom').value;
    if (nom.length < 2) {
        document.getElementById('nom-error').textContent = 'Le nom doit comporter au moins 2 caractères.';
        isValid = false;
    }

    // Prénom
    const prenom = document.getElementById('prenom').value;
    if (prenom.length < 2) {
        document.getElementById('prenom-error').textContent = 'Le prénom doit comporter au moins 2 caractères.';
        isValid = false;
    }

    // Âge
    const age = document.getElementById('age').value;
    if (age < 10 || age > 90) {
        document.getElementById('age-error').textContent = 'L\'âge doit être compris entre 10 et 90 ans.';
        isValid = false;
    }

    // Sexe
    const sexeSelected = document.querySelector('input[name="sexe"]:checked');
    if (!sexeSelected) {
        document.getElementById('sexe-error').textContent = 'Veuillez sélectionner un sexe.';
        isValid = false;
    }

    // Login
    const login = document.getElementById('login').value;
    if (login.length < 4) {
        document.getElementById('login-error').textContent = 'Le login doit comporter au moins 4 caractères.';
        isValid = false;
    }

    // Mot de passe
    const password = document.getElementById('password').value;
    if (password.length < 6) {
        document.getElementById('password-error').textContent = 'Le mot de passe doit comporter au moins 6 caractères.';
        isValid = false;
    }

    // Confirmation du mot de passe
    const passwordConfirm = document.getElementById('password-confirm').value;
    if (password !== passwordConfirm) {
        document.getElementById('password-confirm-error').textContent = 'Les mots de passe ne correspondent pas.';
        isValid = false;
    }

    // Pays
    const pays = document.getElementById('pays').value;
    if (!pays) {
        document.getElementById('pays-error').textContent = 'Veuillez sélectionner un pays.';
        isValid = false;
    }

    // E-mail
    const email = document.getElementById('email').value;
    if (!email) {
        document.getElementById('email-error').textContent = 'L\'e-mail est obligatoire.';
        isValid = false;
    }

    // If all validations passed
    if (isValid) {
        alert('Formulaire soumis avec succès !');
        // You can handle form submission here (e.g., send data to server)
    }
});
