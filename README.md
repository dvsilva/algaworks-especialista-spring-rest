# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 23-02-configurando-o-redistokenstore
git add .
git commit -m "Configurando o RedisTokenStore"
git push origin 23-02-configurando-o-redistokenstore

git checkout master
git merge --no-ff 23-02-configurando-o-redistokenstore
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