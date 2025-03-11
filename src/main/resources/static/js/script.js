document.addEventListener('DOMContentLoaded', function() {
    console.log('Button App initialized');
    
    // Add smooth transition when buttons are pressed
    const buttons = document.querySelectorAll('.btn');
    
    buttons.forEach(button => {
        button.addEventListener('mousedown', function() {
            this.style.transform = 'scale(0.95)';
        });
        
        button.addEventListener('mouseup', function() {
            this.style.transform = 'scale(1)';
        });
        
        button.addEventListener('mouseleave', function() {
            this.style.transform = 'scale(1)';
        });
    });
    
    // Add animation to the message when it changes
    const messageBox = document.querySelector('.message-box');
    const observer = new MutationObserver(function(mutations) {
        mutations.forEach(function(mutation) {
            if (mutation.type === 'childList') {
                messageBox.animate([
                    { opacity: 0 },
                    { opacity: 1 }
                ], {
                    duration: 500,
                    easing: 'ease-in-out'
                });
            }
        });
    });
    
    observer.observe(document.querySelector('.message'), {
        childList: true,
        characterData: true,
        subtree: true
    });
});
