# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 23-03-entendendo-a-diferenca-entre-stateful-e-stateless-authentication
git add .
git commit -m "Entendendo a diferença entre Stateful e Stateless Authentication"
git push origin 23-03-entendendo-a-diferenca-entre-stateful-e-stateless-authentication

git checkout master
git merge --no-ff 23-03-entendendo-a-diferenca-entre-stateful-e-stateless-authentication
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```

configurar hosts

127.0.0.1       api.algafood.local
127.0.0.1       auth.algafood.local
127.0.0.1       www.algafood.local
127.0.0.1       www.matafome.local
127.0.0.1       www.foodanalytics.local